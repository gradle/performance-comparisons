package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_181 {
    private final Production20_181 production = new Production20_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}