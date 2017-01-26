package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_37 {
    private final Production20_37 production = new Production20_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}