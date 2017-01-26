package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_286 {
    private final Production20_286 production = new Production20_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}