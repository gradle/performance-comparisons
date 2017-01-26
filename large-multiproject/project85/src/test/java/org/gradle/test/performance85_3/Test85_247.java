package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_247 {
    private final Production85_247 production = new Production85_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}