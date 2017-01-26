package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_68 {
    private final Production67_68 production = new Production67_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}