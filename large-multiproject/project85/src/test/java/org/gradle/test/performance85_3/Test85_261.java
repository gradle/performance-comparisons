package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_261 {
    private final Production85_261 production = new Production85_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}