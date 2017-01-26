package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_328 {
    private final Production85_328 production = new Production85_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}