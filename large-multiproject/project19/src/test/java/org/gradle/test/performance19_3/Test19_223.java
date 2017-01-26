package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_223 {
    private final Production19_223 production = new Production19_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}