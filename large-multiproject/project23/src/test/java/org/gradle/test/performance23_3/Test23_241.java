package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_241 {
    private final Production23_241 production = new Production23_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}