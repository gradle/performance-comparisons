package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27976 {
    private final Productionnull_27976 production = new Productionnull_27976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}