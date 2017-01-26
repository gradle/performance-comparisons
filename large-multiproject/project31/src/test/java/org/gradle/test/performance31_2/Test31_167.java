package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_167 {
    private final Production31_167 production = new Production31_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}