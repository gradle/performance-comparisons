package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_186 {
    private final Production20_186 production = new Production20_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}