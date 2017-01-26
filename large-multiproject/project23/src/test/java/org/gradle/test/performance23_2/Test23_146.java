package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_146 {
    private final Production23_146 production = new Production23_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}