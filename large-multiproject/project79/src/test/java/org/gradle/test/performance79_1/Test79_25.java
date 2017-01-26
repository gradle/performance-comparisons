package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_25 {
    private final Production79_25 production = new Production79_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}