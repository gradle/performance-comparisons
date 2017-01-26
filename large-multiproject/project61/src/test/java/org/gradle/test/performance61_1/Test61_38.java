package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_38 {
    private final Production61_38 production = new Production61_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}