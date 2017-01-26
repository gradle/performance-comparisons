package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_428 {
    private final Production33_428 production = new Production33_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}