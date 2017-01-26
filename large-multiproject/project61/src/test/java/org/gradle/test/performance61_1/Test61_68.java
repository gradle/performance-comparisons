package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_68 {
    private final Production61_68 production = new Production61_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}