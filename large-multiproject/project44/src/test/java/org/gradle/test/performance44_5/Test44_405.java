package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_405 {
    private final Production44_405 production = new Production44_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}