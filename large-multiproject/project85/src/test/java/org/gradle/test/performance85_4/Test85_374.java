package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_374 {
    private final Production85_374 production = new Production85_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}