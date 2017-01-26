package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_435 {
    private final Production44_435 production = new Production44_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}