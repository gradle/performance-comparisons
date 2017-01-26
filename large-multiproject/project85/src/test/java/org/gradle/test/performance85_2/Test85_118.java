package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_118 {
    private final Production85_118 production = new Production85_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}