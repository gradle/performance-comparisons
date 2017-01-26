package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_283 {
    private final Production85_283 production = new Production85_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}