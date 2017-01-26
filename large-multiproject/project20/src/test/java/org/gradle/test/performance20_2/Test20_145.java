package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_145 {
    private final Production20_145 production = new Production20_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}