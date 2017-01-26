package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_300 {
    private final Production58_300 production = new Production58_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}