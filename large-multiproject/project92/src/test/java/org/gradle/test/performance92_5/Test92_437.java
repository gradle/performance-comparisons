package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_437 {
    private final Production92_437 production = new Production92_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}