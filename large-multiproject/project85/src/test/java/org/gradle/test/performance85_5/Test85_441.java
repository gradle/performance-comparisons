package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_441 {
    private final Production85_441 production = new Production85_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}