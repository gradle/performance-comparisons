package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_474 {
    private final Production79_474 production = new Production79_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}