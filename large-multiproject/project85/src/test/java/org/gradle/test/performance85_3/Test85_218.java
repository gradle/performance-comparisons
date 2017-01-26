package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_218 {
    private final Production85_218 production = new Production85_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}