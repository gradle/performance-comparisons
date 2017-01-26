package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_345 {
    private final Production85_345 production = new Production85_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}