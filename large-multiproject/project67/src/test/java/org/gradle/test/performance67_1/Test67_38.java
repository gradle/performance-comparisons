package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_38 {
    private final Production67_38 production = new Production67_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}