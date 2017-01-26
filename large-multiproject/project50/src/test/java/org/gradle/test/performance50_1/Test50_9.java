package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_9 {
    private final Production50_9 production = new Production50_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}