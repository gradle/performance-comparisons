package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_202 {
    private final Production44_202 production = new Production44_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}