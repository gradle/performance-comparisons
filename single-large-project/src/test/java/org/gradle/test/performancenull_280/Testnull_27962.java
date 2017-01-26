package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27962 {
    private final Productionnull_27962 production = new Productionnull_27962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}