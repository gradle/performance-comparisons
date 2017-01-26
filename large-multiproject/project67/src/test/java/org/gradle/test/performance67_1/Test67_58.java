package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_58 {
    private final Production67_58 production = new Production67_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}