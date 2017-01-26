package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_386 {
    private final Production14_386 production = new Production14_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}