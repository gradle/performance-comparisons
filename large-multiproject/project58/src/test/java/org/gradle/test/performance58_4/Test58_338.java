package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_338 {
    private final Production58_338 production = new Production58_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}