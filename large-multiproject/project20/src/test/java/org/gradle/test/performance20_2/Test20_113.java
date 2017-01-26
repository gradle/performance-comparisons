package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_113 {
    private final Production20_113 production = new Production20_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}