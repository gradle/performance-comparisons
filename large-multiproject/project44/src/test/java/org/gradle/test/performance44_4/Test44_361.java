package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_361 {
    private final Production44_361 production = new Production44_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}