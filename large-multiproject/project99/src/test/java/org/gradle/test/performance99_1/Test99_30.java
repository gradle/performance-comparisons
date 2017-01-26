package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_30 {
    private final Production99_30 production = new Production99_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}