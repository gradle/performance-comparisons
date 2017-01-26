package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_445 {
    private final Production89_445 production = new Production89_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}