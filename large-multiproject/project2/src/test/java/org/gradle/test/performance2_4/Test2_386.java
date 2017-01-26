package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_386 {
    private final Production2_386 production = new Production2_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}