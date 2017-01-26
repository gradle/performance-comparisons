package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_283 {
    private final Production79_283 production = new Production79_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}