package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_239 {
    private final Production23_239 production = new Production23_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}