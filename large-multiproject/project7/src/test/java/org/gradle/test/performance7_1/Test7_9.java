package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_9 {
    private final Production7_9 production = new Production7_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}