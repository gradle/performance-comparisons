package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42428 {
    private final Productionnull_42428 production = new Productionnull_42428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}