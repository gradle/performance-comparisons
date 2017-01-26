package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_465 {
    private final Production67_465 production = new Production67_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}