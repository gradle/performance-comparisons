package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_486 {
    private final Production85_486 production = new Production85_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}