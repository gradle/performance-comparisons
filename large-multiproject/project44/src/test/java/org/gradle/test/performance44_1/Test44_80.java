package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_80 {
    private final Production44_80 production = new Production44_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}