package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_386 {
    private final Production42_386 production = new Production42_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}