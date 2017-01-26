package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_41 {
    private final Production84_41 production = new Production84_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}