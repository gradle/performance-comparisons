package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_173 {
    private final Production44_173 production = new Production44_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}