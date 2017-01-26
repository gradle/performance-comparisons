package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_77 {
    private final Production61_77 production = new Production61_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}