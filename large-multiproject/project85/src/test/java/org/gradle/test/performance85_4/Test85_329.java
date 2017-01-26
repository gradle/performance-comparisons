package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_329 {
    private final Production85_329 production = new Production85_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}