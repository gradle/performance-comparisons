package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_286 {
    private final Production88_286 production = new Production88_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}