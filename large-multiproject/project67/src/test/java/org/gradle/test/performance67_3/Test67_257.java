package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_257 {
    private final Production67_257 production = new Production67_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}