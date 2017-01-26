package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_295 {
    private final Production85_295 production = new Production85_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}