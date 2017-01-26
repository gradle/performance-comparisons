package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_134 {
    private final Production44_134 production = new Production44_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}