package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40306 {
    private final Productionnull_40306 production = new Productionnull_40306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}