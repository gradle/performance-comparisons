package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_431 {
    private final Production99_431 production = new Production99_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}