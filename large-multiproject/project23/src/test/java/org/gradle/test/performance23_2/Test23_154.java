package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_154 {
    private final Production23_154 production = new Production23_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}