package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_377 {
    private final Production85_377 production = new Production85_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}