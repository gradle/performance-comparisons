package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_90 {
    private final Production23_90 production = new Production23_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}