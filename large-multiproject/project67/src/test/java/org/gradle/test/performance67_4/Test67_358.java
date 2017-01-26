package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_358 {
    private final Production67_358 production = new Production67_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}