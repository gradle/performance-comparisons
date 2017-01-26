package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_213 {
    private final Production79_213 production = new Production79_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}