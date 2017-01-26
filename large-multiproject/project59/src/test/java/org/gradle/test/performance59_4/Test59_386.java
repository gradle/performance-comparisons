package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_386 {
    private final Production59_386 production = new Production59_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}