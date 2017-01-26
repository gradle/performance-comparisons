package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_167 {
    private final Production93_167 production = new Production93_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}