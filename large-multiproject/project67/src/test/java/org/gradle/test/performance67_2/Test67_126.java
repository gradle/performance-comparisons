package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_126 {
    private final Production67_126 production = new Production67_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}