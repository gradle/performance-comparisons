package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_305 {
    private final Production58_305 production = new Production58_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}