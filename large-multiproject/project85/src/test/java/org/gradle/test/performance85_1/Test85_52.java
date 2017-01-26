package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_52 {
    private final Production85_52 production = new Production85_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}