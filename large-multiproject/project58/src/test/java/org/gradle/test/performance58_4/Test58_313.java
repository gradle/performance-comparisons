package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_313 {
    private final Production58_313 production = new Production58_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}