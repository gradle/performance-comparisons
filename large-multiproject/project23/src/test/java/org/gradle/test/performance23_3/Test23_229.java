package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_229 {
    private final Production23_229 production = new Production23_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}