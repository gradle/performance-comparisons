package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_97 {
    private final Production84_97 production = new Production84_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}