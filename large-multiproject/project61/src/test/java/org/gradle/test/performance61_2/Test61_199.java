package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_199 {
    private final Production61_199 production = new Production61_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}