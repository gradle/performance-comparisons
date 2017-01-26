package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_125 {
    private final Production85_125 production = new Production85_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}