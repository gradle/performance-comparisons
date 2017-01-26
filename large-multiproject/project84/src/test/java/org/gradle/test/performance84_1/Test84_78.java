package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_78 {
    private final Production84_78 production = new Production84_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}