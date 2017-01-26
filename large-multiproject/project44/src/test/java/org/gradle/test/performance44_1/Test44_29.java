package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_29 {
    private final Production44_29 production = new Production44_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}