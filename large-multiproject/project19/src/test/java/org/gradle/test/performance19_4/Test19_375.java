package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_375 {
    private final Production19_375 production = new Production19_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}