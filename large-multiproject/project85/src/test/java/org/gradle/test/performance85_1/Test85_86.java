package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_86 {
    private final Production85_86 production = new Production85_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}