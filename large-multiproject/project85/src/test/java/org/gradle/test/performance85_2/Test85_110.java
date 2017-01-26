package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_110 {
    private final Production85_110 production = new Production85_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}