package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_386 {
    private final Production74_386 production = new Production74_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}