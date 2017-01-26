package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_235 {
    private final Production85_235 production = new Production85_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}