package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_361 {
    private final Production58_361 production = new Production58_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}