package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_183 {
    private final Production25_183 production = new Production25_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}