package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_158 {
    private final Production85_158 production = new Production85_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}