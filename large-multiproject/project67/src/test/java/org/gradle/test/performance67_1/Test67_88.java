package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_88 {
    private final Production67_88 production = new Production67_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}