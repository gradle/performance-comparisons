package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_76 {
    private final Production89_76 production = new Production89_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}