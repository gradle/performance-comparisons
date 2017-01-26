package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_49 {
    private final Production20_49 production = new Production20_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}