package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_9 {
    private final Production49_9 production = new Production49_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}