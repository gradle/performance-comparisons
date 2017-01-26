package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_244 {
    private final Production44_244 production = new Production44_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}