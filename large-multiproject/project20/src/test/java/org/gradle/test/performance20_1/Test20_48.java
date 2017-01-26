package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_48 {
    private final Production20_48 production = new Production20_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}