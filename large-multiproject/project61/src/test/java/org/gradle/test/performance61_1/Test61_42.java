package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_42 {
    private final Production61_42 production = new Production61_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}