package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_267 {
    private final Production61_267 production = new Production61_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}