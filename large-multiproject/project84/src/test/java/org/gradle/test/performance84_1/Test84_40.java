package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_40 {
    private final Production84_40 production = new Production84_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}