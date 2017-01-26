package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_95 {
    private final Production79_95 production = new Production79_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}