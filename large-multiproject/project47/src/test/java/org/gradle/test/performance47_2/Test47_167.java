package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_167 {
    private final Production47_167 production = new Production47_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}