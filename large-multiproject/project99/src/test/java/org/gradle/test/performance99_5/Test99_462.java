package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_462 {
    private final Production99_462 production = new Production99_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}