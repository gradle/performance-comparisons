package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_9 {
    private final Production99_9 production = new Production99_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}