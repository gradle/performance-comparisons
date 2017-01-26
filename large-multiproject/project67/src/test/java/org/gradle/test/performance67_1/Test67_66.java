package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_66 {
    private final Production67_66 production = new Production67_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}