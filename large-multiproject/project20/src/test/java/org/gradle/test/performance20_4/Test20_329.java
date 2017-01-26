package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_329 {
    private final Production20_329 production = new Production20_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}