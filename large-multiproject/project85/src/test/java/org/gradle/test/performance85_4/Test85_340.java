package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_340 {
    private final Production85_340 production = new Production85_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}