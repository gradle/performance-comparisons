package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_30 {
    private final Production79_30 production = new Production79_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}