package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_48 {
    private final Production44_48 production = new Production44_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}