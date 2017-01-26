package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_103 {
    private final Production79_103 production = new Production79_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}