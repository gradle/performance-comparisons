package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_247 {
    private final Production99_247 production = new Production99_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}