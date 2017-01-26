package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_437 {
    private final Production7_437 production = new Production7_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}