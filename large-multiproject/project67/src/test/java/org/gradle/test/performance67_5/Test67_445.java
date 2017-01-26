package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_445 {
    private final Production67_445 production = new Production67_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}