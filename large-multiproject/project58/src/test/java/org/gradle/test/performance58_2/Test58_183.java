package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_183 {
    private final Production58_183 production = new Production58_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}