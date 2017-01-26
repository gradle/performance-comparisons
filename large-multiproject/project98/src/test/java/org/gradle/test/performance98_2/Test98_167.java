package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_167 {
    private final Production98_167 production = new Production98_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}