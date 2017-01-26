package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_2 {
    private final Production23_2 production = new Production23_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}