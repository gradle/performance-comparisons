package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_72 {
    private final Production44_72 production = new Production44_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}