package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_188 {
    private final Production23_188 production = new Production23_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}