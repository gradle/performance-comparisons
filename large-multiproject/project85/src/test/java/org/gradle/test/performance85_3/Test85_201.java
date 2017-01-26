package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_201 {
    private final Production85_201 production = new Production85_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}