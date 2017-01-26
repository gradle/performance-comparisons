package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_84 {
    private final Production85_84 production = new Production85_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}