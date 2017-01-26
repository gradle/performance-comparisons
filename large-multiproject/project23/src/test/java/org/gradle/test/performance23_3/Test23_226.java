package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_226 {
    private final Production23_226 production = new Production23_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}