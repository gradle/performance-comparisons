package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_48 {
    private final Production79_48 production = new Production79_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}