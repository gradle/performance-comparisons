package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_253 {
    private final Production23_253 production = new Production23_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}