public class BinaryTree<Integer> {
    /**
     * myBST enables the capability to build a binary tree of SalesRecord objects for use with the
     * vehicle sales data received and processed by other classes.
     * Will contain at least the following:
     * boolean insert(SalesRecord sr) <-add to the tree
     * int search(Date date) <- return the number of records on or after that date
     * int recursiveSearch(Date date) <- return the number of records on or after that date, found with a recursive method
     *
     * @author Sweeney
     * @version 20231011
     */
        protected Node<Integer> root;

    /**
     *
     */
    public  BinaryTree(){
            root = null;
        }

        /**
         * Internal class to build nodes for our binary tree.
         * @param <Integer> nodes of type Integer
         *
         */
        protected static class Node<Integer>{
            Integer data;
            Node<Integer> left;
            Node<Integer> right;

            /**
             * Builder for nodes
             * @param data
             */
            public Node(Integer data) {
                this.data = data;
                left = null;
                right = null;
            }

        }
    }


