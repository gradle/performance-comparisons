package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_80 {
    private final Production61_80 production = new Production61_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}