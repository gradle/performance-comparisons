package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_138 {
    private final Production23_138 production = new Production23_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}