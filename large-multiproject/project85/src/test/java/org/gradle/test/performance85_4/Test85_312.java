package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_312 {
    private final Production85_312 production = new Production85_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}