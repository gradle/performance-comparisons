package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_492 {
    private final Production99_492 production = new Production99_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}