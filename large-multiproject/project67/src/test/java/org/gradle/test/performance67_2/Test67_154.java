package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_154 {
    private final Production67_154 production = new Production67_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}