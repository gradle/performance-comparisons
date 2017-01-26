package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30890 {
    private final Productionnull_30890 production = new Productionnull_30890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}