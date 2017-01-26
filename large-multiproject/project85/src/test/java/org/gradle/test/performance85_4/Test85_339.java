package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_339 {
    private final Production85_339 production = new Production85_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}