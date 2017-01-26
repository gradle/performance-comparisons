package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_107 {
    private final Production23_107 production = new Production23_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}