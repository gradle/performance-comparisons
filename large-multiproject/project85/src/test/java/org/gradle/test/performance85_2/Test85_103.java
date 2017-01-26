package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_103 {
    private final Production85_103 production = new Production85_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}