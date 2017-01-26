package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_406 {
    private final Production67_406 production = new Production67_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}