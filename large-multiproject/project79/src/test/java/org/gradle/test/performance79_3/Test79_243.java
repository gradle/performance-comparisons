package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_243 {
    private final Production79_243 production = new Production79_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}