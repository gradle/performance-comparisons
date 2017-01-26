package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_196 {
    private final Production23_196 production = new Production23_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}