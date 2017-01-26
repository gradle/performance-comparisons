package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_164 {
    private final Production85_164 production = new Production85_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}