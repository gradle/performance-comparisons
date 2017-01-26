package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_9 {
    private final Production46_9 production = new Production46_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}