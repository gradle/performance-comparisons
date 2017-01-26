package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_80 {
    private final Production67_80 production = new Production67_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}