package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_214 {
    private final Production23_214 production = new Production23_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}