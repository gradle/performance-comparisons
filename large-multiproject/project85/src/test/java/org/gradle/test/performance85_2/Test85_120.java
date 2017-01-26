package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_120 {
    private final Production85_120 production = new Production85_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}