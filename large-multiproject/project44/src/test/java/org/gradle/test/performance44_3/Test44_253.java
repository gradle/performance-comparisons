package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_253 {
    private final Production44_253 production = new Production44_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}