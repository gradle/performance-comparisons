package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_497 {
    private final Production44_497 production = new Production44_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}