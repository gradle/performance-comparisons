package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_395 {
    private final Production67_395 production = new Production67_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}