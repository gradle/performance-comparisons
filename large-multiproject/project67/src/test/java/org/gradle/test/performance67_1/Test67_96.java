package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_96 {
    private final Production67_96 production = new Production67_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}