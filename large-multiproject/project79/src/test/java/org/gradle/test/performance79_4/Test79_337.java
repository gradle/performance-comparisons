package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_337 {
    private final Production79_337 production = new Production79_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}