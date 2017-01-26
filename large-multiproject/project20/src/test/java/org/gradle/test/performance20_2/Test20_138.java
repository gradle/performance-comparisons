package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_138 {
    private final Production20_138 production = new Production20_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}