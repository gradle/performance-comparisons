package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_139 {
    private final Production20_139 production = new Production20_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}