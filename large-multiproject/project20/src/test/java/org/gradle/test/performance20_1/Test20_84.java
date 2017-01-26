package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_84 {
    private final Production20_84 production = new Production20_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}