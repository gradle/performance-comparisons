package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_9 {
    private final Production60_9 production = new Production60_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}