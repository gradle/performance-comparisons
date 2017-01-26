package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_292 {
    private final Production85_292 production = new Production85_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}