package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_432 {
    private final Production58_432 production = new Production58_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}