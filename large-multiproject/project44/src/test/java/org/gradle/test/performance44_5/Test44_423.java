package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_423 {
    private final Production44_423 production = new Production44_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}