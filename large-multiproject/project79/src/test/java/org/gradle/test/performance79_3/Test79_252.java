package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_252 {
    private final Production79_252 production = new Production79_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}