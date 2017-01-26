package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_220 {
    private final Production44_220 production = new Production44_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}