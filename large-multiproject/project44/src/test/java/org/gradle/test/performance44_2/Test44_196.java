package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_196 {
    private final Production44_196 production = new Production44_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}