package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_474 {
    private final Production99_474 production = new Production99_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}