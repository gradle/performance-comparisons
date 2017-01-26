package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_9 {
    private final Production18_9 production = new Production18_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}