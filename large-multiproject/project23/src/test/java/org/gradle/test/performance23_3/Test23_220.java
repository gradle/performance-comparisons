package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_220 {
    private final Production23_220 production = new Production23_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}