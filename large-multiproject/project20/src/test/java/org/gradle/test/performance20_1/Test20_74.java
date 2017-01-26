package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_74 {
    private final Production20_74 production = new Production20_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}