package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_290 {
    private final Production58_290 production = new Production58_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}