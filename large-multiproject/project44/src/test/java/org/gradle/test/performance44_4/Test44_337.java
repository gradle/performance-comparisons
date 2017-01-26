package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_337 {
    private final Production44_337 production = new Production44_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}