package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_423 {
    private final Production92_423 production = new Production92_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}