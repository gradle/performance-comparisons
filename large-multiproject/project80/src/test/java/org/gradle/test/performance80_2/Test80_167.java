package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_167 {
    private final Production80_167 production = new Production80_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}