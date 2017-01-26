package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_386 {
    private final Production10_386 production = new Production10_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}