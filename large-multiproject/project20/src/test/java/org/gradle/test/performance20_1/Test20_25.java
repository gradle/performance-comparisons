package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_25 {
    private final Production20_25 production = new Production20_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}