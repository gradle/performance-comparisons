package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27931 {
    private final Productionnull_27931 production = new Productionnull_27931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}