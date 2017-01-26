package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_290 {
    private final Production44_290 production = new Production44_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}