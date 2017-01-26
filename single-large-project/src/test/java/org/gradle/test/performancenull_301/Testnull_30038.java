package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30038 {
    private final Productionnull_30038 production = new Productionnull_30038("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}