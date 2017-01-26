package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_26 {
    private final Production88_26 production = new Production88_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}