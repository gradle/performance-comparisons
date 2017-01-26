package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_423 {
    private final Production85_423 production = new Production85_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}