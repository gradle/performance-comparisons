package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_124 {
    private final Production85_124 production = new Production85_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}