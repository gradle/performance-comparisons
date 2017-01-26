package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_34 {
    private final Production44_34 production = new Production44_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}