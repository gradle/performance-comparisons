package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_9 {
    private final Production94_9 production = new Production94_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}