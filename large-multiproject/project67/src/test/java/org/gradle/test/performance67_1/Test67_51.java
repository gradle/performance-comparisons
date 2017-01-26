package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_51 {
    private final Production67_51 production = new Production67_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}