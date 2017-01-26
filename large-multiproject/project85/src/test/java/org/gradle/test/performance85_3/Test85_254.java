package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_254 {
    private final Production85_254 production = new Production85_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}