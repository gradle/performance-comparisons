package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_5 {
    private final Production44_5 production = new Production44_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}