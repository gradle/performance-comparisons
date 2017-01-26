package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_484 {
    private final Production67_484 production = new Production67_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}