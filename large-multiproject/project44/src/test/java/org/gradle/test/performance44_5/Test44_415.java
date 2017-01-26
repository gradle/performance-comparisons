package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_415 {
    private final Production44_415 production = new Production44_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}