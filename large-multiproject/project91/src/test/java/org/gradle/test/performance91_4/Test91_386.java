package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_386 {
    private final Production91_386 production = new Production91_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}