package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_57 {
    private final Production44_57 production = new Production44_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}