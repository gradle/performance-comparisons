package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_76 {
    private final Production84_76 production = new Production84_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}