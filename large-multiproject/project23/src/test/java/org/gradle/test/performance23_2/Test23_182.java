package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_182 {
    private final Production23_182 production = new Production23_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}