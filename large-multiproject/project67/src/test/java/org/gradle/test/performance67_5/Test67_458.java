package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_458 {
    private final Production67_458 production = new Production67_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}