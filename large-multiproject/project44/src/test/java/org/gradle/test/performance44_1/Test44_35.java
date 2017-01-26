package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_35 {
    private final Production44_35 production = new Production44_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}