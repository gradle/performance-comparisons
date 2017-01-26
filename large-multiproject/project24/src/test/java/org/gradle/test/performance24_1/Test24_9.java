package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_9 {
    private final Production24_9 production = new Production24_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}