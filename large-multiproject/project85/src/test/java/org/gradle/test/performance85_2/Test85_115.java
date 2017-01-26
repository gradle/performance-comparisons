package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_115 {
    private final Production85_115 production = new Production85_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}