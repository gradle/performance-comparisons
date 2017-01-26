package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_396 {
    private final Production79_396 production = new Production79_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}