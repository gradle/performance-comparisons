package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_9 {
    private final Production89_9 production = new Production89_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}