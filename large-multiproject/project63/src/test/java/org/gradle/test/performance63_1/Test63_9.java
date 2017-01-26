package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_9 {
    private final Production63_9 production = new Production63_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}