package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_148 {
    private final Production85_148 production = new Production85_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}