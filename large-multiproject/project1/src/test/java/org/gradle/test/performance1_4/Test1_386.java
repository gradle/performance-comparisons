package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_386 {
    private final Production1_386 production = new Production1_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}