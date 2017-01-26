package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_338 {
    private final Production84_338 production = new Production84_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}