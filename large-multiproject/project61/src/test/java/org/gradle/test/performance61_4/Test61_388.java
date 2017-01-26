package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_388 {
    private final Production61_388 production = new Production61_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}