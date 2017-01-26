package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_99 {
    private final Production67_99 production = new Production67_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}