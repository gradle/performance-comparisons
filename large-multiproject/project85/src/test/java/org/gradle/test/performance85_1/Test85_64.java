package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_64 {
    private final Production85_64 production = new Production85_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}