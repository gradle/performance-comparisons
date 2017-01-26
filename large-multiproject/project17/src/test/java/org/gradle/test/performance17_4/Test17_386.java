package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_386 {
    private final Production17_386 production = new Production17_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}