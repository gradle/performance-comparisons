package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_168 {
    private final Production67_168 production = new Production67_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}