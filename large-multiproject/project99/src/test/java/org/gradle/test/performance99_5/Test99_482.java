package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_482 {
    private final Production99_482 production = new Production99_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}