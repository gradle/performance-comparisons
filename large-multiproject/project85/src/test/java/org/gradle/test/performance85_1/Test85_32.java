package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_32 {
    private final Production85_32 production = new Production85_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}