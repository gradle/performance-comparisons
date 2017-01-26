package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_9 {
    private final Production15_9 production = new Production15_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}