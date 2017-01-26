package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_322 {
    private final Production44_322 production = new Production44_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}