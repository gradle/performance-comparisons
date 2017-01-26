package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_225 {
    private final Production84_225 production = new Production84_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}