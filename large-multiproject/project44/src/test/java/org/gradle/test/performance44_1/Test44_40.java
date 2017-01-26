package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_40 {
    private final Production44_40 production = new Production44_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}