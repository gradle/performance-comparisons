package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_193 {
    private final Production85_193 production = new Production85_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}