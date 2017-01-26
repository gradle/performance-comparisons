package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_412 {
    private final Production85_412 production = new Production85_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}