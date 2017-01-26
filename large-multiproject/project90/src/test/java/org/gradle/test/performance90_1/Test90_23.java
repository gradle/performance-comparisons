package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_23 {
    private final Production90_23 production = new Production90_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}