package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_386 {
    private final Production73_386 production = new Production73_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}