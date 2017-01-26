package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_474 {
    private final Production7_474 production = new Production7_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}