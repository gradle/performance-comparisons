package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_343 {
    private final Production79_343 production = new Production79_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}