package org.gradle.test.performancenull_280;

import static org.junit.Assert.*;

public class Testnull_27986 {
    private final Productionnull_27986 production = new Productionnull_27986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}