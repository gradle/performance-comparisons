package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_468 {
    private final Production85_468 production = new Production85_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}