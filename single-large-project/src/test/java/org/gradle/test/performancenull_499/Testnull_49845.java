package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49845 {
    private final Productionnull_49845 production = new Productionnull_49845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}