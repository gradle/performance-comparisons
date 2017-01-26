package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_98 {
    private final Production88_98 production = new Production88_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}