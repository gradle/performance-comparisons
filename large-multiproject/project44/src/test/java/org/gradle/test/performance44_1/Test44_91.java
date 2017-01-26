package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_91 {
    private final Production44_91 production = new Production44_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}