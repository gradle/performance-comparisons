package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_67 {
    private final Production67_67 production = new Production67_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}