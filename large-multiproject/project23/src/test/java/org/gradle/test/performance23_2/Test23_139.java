package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_139 {
    private final Production23_139 production = new Production23_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}