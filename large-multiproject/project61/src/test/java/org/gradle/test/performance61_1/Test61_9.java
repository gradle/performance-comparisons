package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_9 {
    private final Production61_9 production = new Production61_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}