package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_499 {
    private final Production85_499 production = new Production85_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}