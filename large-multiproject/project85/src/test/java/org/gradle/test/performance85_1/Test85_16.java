package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_16 {
    private final Production85_16 production = new Production85_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}