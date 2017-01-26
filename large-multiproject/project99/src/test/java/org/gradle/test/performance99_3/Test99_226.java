package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_226 {
    private final Production99_226 production = new Production99_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}