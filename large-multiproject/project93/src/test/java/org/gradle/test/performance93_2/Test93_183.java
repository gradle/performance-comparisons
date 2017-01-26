package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_183 {
    private final Production93_183 production = new Production93_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}