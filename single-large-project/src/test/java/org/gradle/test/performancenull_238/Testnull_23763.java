package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23763 {
    private final Productionnull_23763 production = new Productionnull_23763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}