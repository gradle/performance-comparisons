package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40362 {
    private final Productionnull_40362 production = new Productionnull_40362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}