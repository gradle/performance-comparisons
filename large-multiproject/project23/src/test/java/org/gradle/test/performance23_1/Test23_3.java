package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_3 {
    private final Production23_3 production = new Production23_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}