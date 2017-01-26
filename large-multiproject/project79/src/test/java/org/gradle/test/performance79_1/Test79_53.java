package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_53 {
    private final Production79_53 production = new Production79_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}