package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_59 {
    private final Production79_59 production = new Production79_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}