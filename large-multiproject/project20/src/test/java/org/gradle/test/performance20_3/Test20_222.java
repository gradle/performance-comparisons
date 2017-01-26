package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_222 {
    private final Production20_222 production = new Production20_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}