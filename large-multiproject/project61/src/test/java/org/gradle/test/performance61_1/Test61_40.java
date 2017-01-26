package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_40 {
    private final Production61_40 production = new Production61_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}