package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_56 {
    private final Production85_56 production = new Production85_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}