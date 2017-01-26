package org.gradle.test.performancenull_279;

import static org.junit.Assert.*;

public class Testnull_27845 {
    private final Productionnull_27845 production = new Productionnull_27845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}