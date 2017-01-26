package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_72 {
    private final Production61_72 production = new Production61_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}