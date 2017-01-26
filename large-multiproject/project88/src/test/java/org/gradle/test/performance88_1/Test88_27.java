package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_27 {
    private final Production88_27 production = new Production88_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}