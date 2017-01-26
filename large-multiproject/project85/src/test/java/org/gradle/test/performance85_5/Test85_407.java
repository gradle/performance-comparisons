package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_407 {
    private final Production85_407 production = new Production85_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}