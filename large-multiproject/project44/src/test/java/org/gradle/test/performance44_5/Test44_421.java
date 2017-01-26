package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_421 {
    private final Production44_421 production = new Production44_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}