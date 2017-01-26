package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_52 {
    private final Production99_52 production = new Production99_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}