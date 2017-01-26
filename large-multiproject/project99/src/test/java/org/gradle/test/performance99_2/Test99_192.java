package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_192 {
    private final Production99_192 production = new Production99_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}