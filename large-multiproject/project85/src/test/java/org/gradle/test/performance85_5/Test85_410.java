package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_410 {
    private final Production85_410 production = new Production85_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}