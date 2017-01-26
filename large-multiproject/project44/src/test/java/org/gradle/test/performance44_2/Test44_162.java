package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_162 {
    private final Production44_162 production = new Production44_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}