package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_151 {
    private final Production23_151 production = new Production23_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}