package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_333 {
    private final Production85_333 production = new Production85_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}