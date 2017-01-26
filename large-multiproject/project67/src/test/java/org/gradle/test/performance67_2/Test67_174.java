package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_174 {
    private final Production67_174 production = new Production67_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}