package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40392 {
    private final Productionnull_40392 production = new Productionnull_40392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}