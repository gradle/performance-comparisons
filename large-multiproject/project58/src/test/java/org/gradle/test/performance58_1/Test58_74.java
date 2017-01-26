package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_74 {
    private final Production58_74 production = new Production58_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}