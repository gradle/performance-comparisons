package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_405 {
    private final Production85_405 production = new Production85_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}