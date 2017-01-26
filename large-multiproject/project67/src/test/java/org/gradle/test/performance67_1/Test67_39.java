package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_39 {
    private final Production67_39 production = new Production67_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}