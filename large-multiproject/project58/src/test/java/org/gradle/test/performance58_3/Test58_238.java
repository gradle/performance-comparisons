package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_238 {
    private final Production58_238 production = new Production58_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}