package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40347 {
    private final Productionnull_40347 production = new Productionnull_40347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}