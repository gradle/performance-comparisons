package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_246 {
    private final Production84_246 production = new Production84_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}