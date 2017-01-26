package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_386 {
    private final Production30_386 production = new Production30_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}