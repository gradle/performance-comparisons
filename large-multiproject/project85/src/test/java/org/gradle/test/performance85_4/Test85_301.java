package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_301 {
    private final Production85_301 production = new Production85_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}