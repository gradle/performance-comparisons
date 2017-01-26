package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40358 {
    private final Productionnull_40358 production = new Productionnull_40358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}