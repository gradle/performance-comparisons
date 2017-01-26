package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_356 {
    private final Production23_356 production = new Production23_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}