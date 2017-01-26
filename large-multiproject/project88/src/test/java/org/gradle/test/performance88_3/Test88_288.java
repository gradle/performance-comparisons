package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_288 {
    private final Production88_288 production = new Production88_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}