package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_476 {
    private final Production23_476 production = new Production23_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}