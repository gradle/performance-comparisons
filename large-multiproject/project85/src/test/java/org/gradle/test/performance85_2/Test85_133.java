package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_133 {
    private final Production85_133 production = new Production85_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}