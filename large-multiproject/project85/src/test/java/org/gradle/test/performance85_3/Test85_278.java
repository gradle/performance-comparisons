package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_278 {
    private final Production85_278 production = new Production85_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}