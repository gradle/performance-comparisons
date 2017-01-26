package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_149 {
    private final Production85_149 production = new Production85_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}