package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_303 {
    private final Production58_303 production = new Production58_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}