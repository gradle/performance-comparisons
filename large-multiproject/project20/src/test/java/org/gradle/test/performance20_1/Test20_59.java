package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_59 {
    private final Production20_59 production = new Production20_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}