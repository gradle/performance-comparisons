package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_226 {
    private final Production85_226 production = new Production85_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}