package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_9 {
    private final Production27_9 production = new Production27_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}