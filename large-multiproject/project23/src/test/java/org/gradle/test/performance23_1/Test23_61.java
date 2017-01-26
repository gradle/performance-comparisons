package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_61 {
    private final Production23_61 production = new Production23_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}