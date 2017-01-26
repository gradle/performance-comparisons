package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_311 {
    private final Production85_311 production = new Production85_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}