package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_181 {
    private final Production44_181 production = new Production44_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}