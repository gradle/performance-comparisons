package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27190 {
    private final Productionnull_27190 production = new Productionnull_27190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}