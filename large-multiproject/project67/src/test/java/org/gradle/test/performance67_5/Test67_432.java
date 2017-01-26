package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_432 {
    private final Production67_432 production = new Production67_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}