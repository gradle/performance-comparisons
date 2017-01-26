package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_143 {
    private final Production85_143 production = new Production85_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}