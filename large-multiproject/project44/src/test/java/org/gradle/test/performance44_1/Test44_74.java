package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_74 {
    private final Production44_74 production = new Production44_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}