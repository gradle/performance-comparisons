package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_163 {
    private final Production44_163 production = new Production44_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}