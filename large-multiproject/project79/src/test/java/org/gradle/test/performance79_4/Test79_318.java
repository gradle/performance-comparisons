package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_318 {
    private final Production79_318 production = new Production79_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}