package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_183 {
    private final Production75_183 production = new Production75_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}