package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_167 {
    private final Production84_167 production = new Production84_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}