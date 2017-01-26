package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_229 {
    private final Production44_229 production = new Production44_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}