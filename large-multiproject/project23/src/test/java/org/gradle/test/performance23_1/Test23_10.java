package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_10 {
    private final Production23_10 production = new Production23_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}