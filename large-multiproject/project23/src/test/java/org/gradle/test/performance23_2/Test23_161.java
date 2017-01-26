package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_161 {
    private final Production23_161 production = new Production23_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}