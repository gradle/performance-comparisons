package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_386 {
    private final Production77_386 production = new Production77_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}