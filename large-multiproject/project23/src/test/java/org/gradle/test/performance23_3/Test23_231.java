package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_231 {
    private final Production23_231 production = new Production23_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}