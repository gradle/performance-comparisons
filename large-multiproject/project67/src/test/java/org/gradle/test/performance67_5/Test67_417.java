package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_417 {
    private final Production67_417 production = new Production67_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}