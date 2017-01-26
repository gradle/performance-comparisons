package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_27 {
    private final Production61_27 production = new Production61_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}