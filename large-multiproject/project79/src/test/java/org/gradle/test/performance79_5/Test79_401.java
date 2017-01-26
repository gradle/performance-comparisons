package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_401 {
    private final Production79_401 production = new Production79_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}