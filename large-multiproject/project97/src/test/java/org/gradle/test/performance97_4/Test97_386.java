package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_386 {
    private final Production97_386 production = new Production97_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}