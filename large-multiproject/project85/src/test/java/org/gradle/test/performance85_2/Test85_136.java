package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_136 {
    private final Production85_136 production = new Production85_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}