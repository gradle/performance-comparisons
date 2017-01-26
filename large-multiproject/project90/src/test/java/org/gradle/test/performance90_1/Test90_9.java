package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_9 {
    private final Production90_9 production = new Production90_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}