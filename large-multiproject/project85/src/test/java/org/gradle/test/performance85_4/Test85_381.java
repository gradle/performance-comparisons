package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_381 {
    private final Production85_381 production = new Production85_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}