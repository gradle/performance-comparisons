package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_45 {
    private final Production67_45 production = new Production67_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}