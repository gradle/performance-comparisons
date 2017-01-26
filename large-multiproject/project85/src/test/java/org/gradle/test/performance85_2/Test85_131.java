package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_131 {
    private final Production85_131 production = new Production85_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}