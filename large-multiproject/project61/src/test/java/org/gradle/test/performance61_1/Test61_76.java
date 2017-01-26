package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_76 {
    private final Production61_76 production = new Production61_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}