package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20126 {
    private final Productionnull_20126 production = new Productionnull_20126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}