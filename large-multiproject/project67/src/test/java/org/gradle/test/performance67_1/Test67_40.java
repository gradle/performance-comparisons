package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_40 {
    private final Production67_40 production = new Production67_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}