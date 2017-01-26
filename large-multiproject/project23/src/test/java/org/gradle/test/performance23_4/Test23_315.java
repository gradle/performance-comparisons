package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_315 {
    private final Production23_315 production = new Production23_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}