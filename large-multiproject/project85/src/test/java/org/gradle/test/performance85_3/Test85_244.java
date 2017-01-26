package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_244 {
    private final Production85_244 production = new Production85_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}