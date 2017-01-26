package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_183 {
    private final Production89_183 production = new Production89_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}