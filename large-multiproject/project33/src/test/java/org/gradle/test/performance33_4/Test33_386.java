package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_386 {
    private final Production33_386 production = new Production33_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}