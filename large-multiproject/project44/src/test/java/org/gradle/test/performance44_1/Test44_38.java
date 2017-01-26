package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_38 {
    private final Production44_38 production = new Production44_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}