package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_382 {
    private final Production44_382 production = new Production44_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}