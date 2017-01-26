package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_208 {
    private final Production99_208 production = new Production99_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}