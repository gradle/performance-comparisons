package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_442 {
    private final Production23_442 production = new Production23_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}