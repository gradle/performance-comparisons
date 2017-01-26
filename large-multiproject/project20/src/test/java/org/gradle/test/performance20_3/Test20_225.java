package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_225 {
    private final Production20_225 production = new Production20_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}