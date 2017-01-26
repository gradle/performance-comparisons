package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_75 {
    private final Production84_75 production = new Production84_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}