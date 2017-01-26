package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_100 {
    private final Production20_100 production = new Production20_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}