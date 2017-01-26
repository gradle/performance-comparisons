package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_330 {
    private final Production88_330 production = new Production88_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}