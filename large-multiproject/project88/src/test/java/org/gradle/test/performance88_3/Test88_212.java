package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_212 {
    private final Production88_212 production = new Production88_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}