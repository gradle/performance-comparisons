package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_457 {
    private final Production23_457 production = new Production23_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}