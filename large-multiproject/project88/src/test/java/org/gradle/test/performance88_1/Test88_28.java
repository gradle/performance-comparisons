package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_28 {
    private final Production88_28 production = new Production88_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}