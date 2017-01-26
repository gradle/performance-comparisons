package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_202 {
    private final Production88_202 production = new Production88_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}