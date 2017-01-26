package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_129 {
    private final Production85_129 production = new Production85_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}