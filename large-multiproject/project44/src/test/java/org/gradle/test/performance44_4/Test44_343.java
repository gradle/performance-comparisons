package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_343 {
    private final Production44_343 production = new Production44_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}