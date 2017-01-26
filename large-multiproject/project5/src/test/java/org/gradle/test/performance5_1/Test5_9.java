package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_9 {
    private final Production5_9 production = new Production5_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}