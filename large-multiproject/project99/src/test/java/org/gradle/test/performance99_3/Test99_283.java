package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_283 {
    private final Production99_283 production = new Production99_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}