package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_18 {
    private final Production79_18 production = new Production79_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}