package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_9 {
    private final Production44_9 production = new Production44_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}