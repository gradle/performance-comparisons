package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_27 {
    private final Production84_27 production = new Production84_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}