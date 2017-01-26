package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_35 {
    private final Production23_35 production = new Production23_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}