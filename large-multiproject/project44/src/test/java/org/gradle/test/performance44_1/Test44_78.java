package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_78 {
    private final Production44_78 production = new Production44_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}