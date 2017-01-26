package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_402 {
    private final Production19_402 production = new Production19_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}