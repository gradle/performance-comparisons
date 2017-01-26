package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_112 {
    private final Production23_112 production = new Production23_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}