package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_356 {
    private final Production84_356 production = new Production84_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}