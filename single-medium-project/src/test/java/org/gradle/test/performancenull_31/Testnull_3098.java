package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3098 {
    private final Productionnull_3098 production = new Productionnull_3098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}