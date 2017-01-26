package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_208 {
    private final Production85_208 production = new Production85_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}