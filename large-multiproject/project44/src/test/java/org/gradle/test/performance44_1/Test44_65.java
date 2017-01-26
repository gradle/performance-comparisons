package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_65 {
    private final Production44_65 production = new Production44_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}