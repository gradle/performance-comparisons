package org.gradle.test.performance62_1;

import static org.junit.Assert.*;

public class Test62_9 {
    private final Production62_9 production = new Production62_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}