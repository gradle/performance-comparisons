package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_3 {
    private final Production88_3 production = new Production88_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}