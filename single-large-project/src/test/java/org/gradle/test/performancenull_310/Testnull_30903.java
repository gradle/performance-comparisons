package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30903 {
    private final Productionnull_30903 production = new Productionnull_30903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}