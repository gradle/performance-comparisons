package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_285 {
    private final Production85_285 production = new Production85_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}