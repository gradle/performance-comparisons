package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_370 {
    private final Production85_370 production = new Production85_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}