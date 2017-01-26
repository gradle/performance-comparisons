package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_209 {
    private final Production88_209 production = new Production88_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}