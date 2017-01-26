package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_27 {
    private final Production89_27 production = new Production89_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}