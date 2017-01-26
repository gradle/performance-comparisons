package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_242 {
    private final Production85_242 production = new Production85_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}