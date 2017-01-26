package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_134 {
    private final Production61_134 production = new Production61_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}