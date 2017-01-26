package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_331 {
    private final Production84_331 production = new Production84_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}