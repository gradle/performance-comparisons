package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_287 {
    private final Production85_287 production = new Production85_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}