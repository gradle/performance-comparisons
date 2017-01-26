package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_57 {
    private final Production79_57 production = new Production79_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}