package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_34 {
    private final Production23_34 production = new Production23_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}