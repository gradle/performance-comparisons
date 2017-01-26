package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_386 {
    private final Production72_386 production = new Production72_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}