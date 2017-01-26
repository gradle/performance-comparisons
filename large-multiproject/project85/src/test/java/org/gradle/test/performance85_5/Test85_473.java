package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_473 {
    private final Production85_473 production = new Production85_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}