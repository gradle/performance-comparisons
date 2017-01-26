package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_419 {
    private final Production44_419 production = new Production44_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}