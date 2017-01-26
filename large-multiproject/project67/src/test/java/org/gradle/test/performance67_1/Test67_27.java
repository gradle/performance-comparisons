package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_27 {
    private final Production67_27 production = new Production67_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}