package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_163 {
    private final Production23_163 production = new Production23_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}