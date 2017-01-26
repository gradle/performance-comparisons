package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_192 {
    private final Production85_192 production = new Production85_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}