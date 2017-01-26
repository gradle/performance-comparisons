package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_198 {
    private final Production85_198 production = new Production85_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}