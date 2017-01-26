package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_172 {
    private final Production67_172 production = new Production67_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}