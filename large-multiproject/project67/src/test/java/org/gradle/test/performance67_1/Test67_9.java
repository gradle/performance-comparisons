package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_9 {
    private final Production67_9 production = new Production67_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}