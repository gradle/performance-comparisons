package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_209 {
    private final Production84_209 production = new Production84_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}