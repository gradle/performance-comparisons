package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_179 {
    private final Production85_179 production = new Production85_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}