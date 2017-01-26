package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_450 {
    private final Production44_450 production = new Production44_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}