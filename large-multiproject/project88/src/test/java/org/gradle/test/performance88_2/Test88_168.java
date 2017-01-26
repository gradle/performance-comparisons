package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_168 {
    private final Production88_168 production = new Production88_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}