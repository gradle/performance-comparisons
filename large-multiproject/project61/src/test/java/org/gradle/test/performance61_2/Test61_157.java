package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_157 {
    private final Production61_157 production = new Production61_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}