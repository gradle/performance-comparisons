package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_135 {
    private final Production44_135 production = new Production44_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}