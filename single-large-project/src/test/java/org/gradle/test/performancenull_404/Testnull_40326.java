package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40326 {
    private final Productionnull_40326 production = new Productionnull_40326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}