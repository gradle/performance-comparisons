package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_98 {
    private final Production44_98 production = new Production44_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}