package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_291 {
    private final Production85_291 production = new Production85_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}