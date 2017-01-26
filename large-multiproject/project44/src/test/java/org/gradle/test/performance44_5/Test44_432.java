package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_432 {
    private final Production44_432 production = new Production44_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}