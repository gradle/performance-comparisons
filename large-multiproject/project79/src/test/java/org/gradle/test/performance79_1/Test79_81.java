package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_81 {
    private final Production79_81 production = new Production79_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}