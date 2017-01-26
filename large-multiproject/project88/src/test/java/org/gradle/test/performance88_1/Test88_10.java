package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_10 {
    private final Production88_10 production = new Production88_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}