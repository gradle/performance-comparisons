package org.gradle.test.performance88_4;

import static org.junit.Assert.*;

public class Test88_303 {
    private final Production88_303 production = new Production88_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}