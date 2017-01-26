package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_187 {
    private final Production85_187 production = new Production85_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}