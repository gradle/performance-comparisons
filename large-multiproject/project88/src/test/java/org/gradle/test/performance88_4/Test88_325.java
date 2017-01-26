package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_325 {
    private final Production88_325 production = new Production88_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}