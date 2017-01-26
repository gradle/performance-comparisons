package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_77 {
    private final Production67_77 production = new Production67_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}