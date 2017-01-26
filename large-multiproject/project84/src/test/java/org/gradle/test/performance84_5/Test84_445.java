package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_445 {
    private final Production84_445 production = new Production84_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}