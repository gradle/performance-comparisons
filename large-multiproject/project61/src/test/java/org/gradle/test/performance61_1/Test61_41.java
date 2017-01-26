package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_41 {
    private final Production61_41 production = new Production61_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}