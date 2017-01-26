package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_253 {
    private final Production20_253 production = new Production20_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}