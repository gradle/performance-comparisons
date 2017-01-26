package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_455 {
    private final Production20_455 production = new Production20_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}