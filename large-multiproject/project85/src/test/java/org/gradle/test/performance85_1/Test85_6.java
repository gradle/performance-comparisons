package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_6 {
    private final Production85_6 production = new Production85_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}