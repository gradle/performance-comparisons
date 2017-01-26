package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_100 {
    private final Production67_100 production = new Production67_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}