package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_14 {
    private final Production44_14 production = new Production44_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}