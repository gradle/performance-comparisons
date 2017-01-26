package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_150 {
    private final Production44_150 production = new Production44_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}