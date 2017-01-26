package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_202 {
    private final Production58_202 production = new Production58_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}