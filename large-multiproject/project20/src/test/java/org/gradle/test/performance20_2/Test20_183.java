package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_183 {
    private final Production20_183 production = new Production20_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}