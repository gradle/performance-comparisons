package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_145 {
    private final Production44_145 production = new Production44_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}