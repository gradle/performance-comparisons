package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_273 {
    private final Production85_273 production = new Production85_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}