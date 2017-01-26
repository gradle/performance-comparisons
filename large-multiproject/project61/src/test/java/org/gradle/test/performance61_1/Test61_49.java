package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_49 {
    private final Production61_49 production = new Production61_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}