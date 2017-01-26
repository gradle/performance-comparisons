package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_258 {
    private final Production99_258 production = new Production99_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}