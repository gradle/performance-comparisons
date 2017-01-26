package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_49 {
    private final Production89_49 production = new Production89_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}