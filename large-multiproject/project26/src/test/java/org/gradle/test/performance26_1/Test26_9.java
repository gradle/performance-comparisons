package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_9 {
    private final Production26_9 production = new Production26_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}