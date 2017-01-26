package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_9 {
    private final Production74_9 production = new Production74_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}