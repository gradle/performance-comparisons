package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_134 {
    private final Production23_134 production = new Production23_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}