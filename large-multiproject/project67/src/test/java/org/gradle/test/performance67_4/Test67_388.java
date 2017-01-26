package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_388 {
    private final Production67_388 production = new Production67_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}