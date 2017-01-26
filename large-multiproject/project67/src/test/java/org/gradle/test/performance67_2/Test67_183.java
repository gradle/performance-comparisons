package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_183 {
    private final Production67_183 production = new Production67_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}