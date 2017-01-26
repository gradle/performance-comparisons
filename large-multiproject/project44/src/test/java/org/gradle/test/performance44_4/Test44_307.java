package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_307 {
    private final Production44_307 production = new Production44_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}