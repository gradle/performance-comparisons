package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_51 {
    private final Production23_51 production = new Production23_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}