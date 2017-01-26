package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_175 {
    private final Production20_175 production = new Production20_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}