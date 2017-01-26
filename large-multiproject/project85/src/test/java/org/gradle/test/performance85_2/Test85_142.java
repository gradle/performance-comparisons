package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_142 {
    private final Production85_142 production = new Production85_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}