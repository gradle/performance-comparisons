package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_75 {
    private final Production67_75 production = new Production67_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}