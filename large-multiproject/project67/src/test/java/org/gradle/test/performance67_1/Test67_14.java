package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_14 {
    private final Production67_14 production = new Production67_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}