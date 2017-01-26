package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_386 {
    private final Production79_386 production = new Production79_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}