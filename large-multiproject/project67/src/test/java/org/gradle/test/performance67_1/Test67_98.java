package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_98 {
    private final Production67_98 production = new Production67_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}