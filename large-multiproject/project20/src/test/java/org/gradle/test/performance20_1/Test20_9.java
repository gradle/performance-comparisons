package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_9 {
    private final Production20_9 production = new Production20_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}