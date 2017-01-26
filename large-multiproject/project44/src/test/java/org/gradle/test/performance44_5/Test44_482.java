package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_482 {
    private final Production44_482 production = new Production44_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}