package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_418 {
    private final Production85_418 production = new Production85_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}