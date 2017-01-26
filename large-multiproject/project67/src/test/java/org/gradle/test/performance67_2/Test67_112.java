package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_112 {
    private final Production67_112 production = new Production67_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}