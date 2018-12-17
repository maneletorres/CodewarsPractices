package codewarspractices;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manuel Espinosa Torres
 *
 * '''Codewars exercise: ""'''
 *
 * '''Description:''' For this exercise you will be strengthening your page-fu
 * mastery. You will complete the PaginationHelper class, which is a utility
 * class helpful for querying paging information related to an array.
 *
 * The class is designed to take in an array of values and an integer indicating
 * how many items will be allowed per each page. The types of values contained
 * within the collection/array are not relevant.
 *
 * '''Examples:''' PaginationHelper<Character> helper = new
 * PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
 * helper.pageCount(); //should == 2 helper.itemCount(); //should == 6
 * helper.pageItemCount(0); //should == 4 helper.pageItemCount(1); // last page
 * - should == 2 helper.pageItemCount(2); // should == -1 since the page is
 * invalid
 *
 * pageIndex takes an item index and returns the page that it belongs on
 * helper.pageIndex(5); //should == 1 (zero based index) helper.pageIndex(2);
 * //should == 0 helper.pageIndex(20); //should == -1 helper.pageIndex(-10);
 * //should == -1
 *
 * @param <I>
 */
public class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemPerPage;

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        System.out.println("PageCount: " + helper.pageCount()); //should == 2
        System.out.println("ItemCount: " + helper.itemCount()); //should == 6
        System.out.println("PageItemCount(0): " + helper.pageItemCount(0)); //should == 4
        System.out.println("PageItemCount(1): " + helper.pageItemCount(1)); // last page - should == 2
        System.out.println("PageItemCount(2): " + helper.pageItemCount(2)); // should == -1 since the page is invalid

        // pageIndex takes an item index and returns the page that it belongs on
        System.out.println("PageIndex(5): " + helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println("PageIndex(2): " + helper.pageIndex(2)); //should == 0
        System.out.println("PageIndex(20): " + helper.pageIndex(20)); //should == -1
        System.out.println("PageIndex(-10): " + helper.pageIndex(-10)); //should == -1
    }

    /**
     * The constructor takes in an array of items and a integer indicating how
     * many items fit within a single page.
     *
     * @param collection
     * @param itemsPerPage
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemPerPage = itemsPerPage;
    }

    /**
     * Returns the number of items within the entire collection.
     *
     * @return
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * Returns the number of pages.
     *
     * @return
     */
    public int pageCount() {
        return (int) Math.ceil((double) this.itemCount() / this.itemPerPage);
    }

    /**
     * Returns the number of items on the current page. page_index is zero
     * based. This method should return -1 for pageIndex values that are out of
     * range.
     *
     * @param pageIndex
     * @return
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= this.pageCount()) {
            return -1;
        } else if (pageIndex < this.pageCount() - 1) {
            return this.itemPerPage;
        } else {
            return this.itemCount() % this.itemPerPage;
        }
    }

    /**
     * Determines what page an item is on. Zero based indexes this method should
     * return -1 for itemIndex values that are out of range
     *
     * @param itemIndex
     * @return
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= this.itemCount()) {
            return -1;
        } else {
            return itemIndex / this.itemPerPage;
        }
    }
}
