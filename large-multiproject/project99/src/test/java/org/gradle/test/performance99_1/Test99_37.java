package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_37 {
    private final Production99_37 production = new Production99_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}