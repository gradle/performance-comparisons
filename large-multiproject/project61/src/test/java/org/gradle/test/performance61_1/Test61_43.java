package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_43 {
    private final Production61_43 production = new Production61_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}