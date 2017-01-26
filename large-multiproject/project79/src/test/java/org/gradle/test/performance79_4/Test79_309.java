package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_309 {
    private final Production79_309 production = new Production79_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}