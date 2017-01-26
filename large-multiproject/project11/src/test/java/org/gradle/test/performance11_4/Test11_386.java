package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_386 {
    private final Production11_386 production = new Production11_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}