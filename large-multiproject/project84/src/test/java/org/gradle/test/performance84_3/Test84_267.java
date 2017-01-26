package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_267 {
    private final Production84_267 production = new Production84_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}