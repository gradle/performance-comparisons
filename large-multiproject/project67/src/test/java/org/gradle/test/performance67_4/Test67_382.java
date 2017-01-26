package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_382 {
    private final Production67_382 production = new Production67_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}