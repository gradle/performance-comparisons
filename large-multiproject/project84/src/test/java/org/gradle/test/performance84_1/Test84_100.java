package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_100 {
    private final Production84_100 production = new Production84_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}