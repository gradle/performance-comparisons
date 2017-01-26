package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_348 {
    private final Production85_348 production = new Production85_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}