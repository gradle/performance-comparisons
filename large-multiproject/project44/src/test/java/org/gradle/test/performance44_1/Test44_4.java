package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_4 {
    private final Production44_4 production = new Production44_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}