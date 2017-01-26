package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_176 {
    private final Production85_176 production = new Production85_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}