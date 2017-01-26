package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_195 {
    private final Production67_195 production = new Production67_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}