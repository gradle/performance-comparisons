package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_386 {
    private final Production85_386 production = new Production85_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}