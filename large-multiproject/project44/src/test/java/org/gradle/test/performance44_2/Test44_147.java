package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_147 {
    private final Production44_147 production = new Production44_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}