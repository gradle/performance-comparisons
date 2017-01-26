package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_293 {
    private final Production44_293 production = new Production44_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}