package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_2 {
    private final Production44_2 production = new Production44_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}