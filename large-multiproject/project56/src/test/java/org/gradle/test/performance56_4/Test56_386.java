package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_386 {
    private final Production56_386 production = new Production56_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}