package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_76 {
    private final Production67_76 production = new Production67_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}