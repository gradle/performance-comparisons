package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40686 {
    private final Productionnull_40686 production = new Productionnull_40686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}