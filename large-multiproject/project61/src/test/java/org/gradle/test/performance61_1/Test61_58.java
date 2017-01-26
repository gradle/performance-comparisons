package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_58 {
    private final Production61_58 production = new Production61_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}