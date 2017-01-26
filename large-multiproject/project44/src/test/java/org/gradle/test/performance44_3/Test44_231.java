package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_231 {
    private final Production44_231 production = new Production44_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}