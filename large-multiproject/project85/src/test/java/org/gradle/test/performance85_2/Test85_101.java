package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_101 {
    private final Production85_101 production = new Production85_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}