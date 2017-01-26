package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_74 {
    private final Production23_74 production = new Production23_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}