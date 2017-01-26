package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_9 {
    private final Production30_9 production = new Production30_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}