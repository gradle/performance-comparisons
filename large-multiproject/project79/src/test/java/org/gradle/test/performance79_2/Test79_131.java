package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_131 {
    private final Production79_131 production = new Production79_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}