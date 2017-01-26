package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_6 {
    private final Production79_6 production = new Production79_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}