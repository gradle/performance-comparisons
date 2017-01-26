package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_9 {
    private final Production29_9 production = new Production29_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}