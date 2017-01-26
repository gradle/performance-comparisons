package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_474 {
    private final Production20_474 production = new Production20_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}