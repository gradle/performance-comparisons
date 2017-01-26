package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_471 {
    private final Production79_471 production = new Production79_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}