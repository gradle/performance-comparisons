package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_167 {
    private final Production40_167 production = new Production40_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}