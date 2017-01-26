package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_116 {
    private final Production85_116 production = new Production85_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}