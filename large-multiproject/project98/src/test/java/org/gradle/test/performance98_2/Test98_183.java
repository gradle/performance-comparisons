package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_183 {
    private final Production98_183 production = new Production98_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}