package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_401 {
    private final Production20_401 production = new Production20_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}