package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_298 {
    private final Production85_298 production = new Production85_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}