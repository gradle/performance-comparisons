package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_104 {
    private final Production83_104 production = new Production83_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}