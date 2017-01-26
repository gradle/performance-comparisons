package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_100 {
    private final Production23_100 production = new Production23_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}