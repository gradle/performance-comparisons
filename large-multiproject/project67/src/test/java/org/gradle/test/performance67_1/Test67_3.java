package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_3 {
    private final Production67_3 production = new Production67_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}