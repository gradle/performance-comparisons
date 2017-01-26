package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_450 {
    private final Production58_450 production = new Production58_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}