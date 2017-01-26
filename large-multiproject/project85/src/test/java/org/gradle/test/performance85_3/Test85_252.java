package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_252 {
    private final Production85_252 production = new Production85_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}