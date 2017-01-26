package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_109 {
    private final Production44_109 production = new Production44_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}