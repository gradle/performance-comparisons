package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_10 {
    private final Production67_10 production = new Production67_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}