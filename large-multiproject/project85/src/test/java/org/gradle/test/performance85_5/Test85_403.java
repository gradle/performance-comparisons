package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_403 {
    private final Production85_403 production = new Production85_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}