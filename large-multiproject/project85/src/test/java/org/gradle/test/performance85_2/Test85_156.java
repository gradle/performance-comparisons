package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_156 {
    private final Production85_156 production = new Production85_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}