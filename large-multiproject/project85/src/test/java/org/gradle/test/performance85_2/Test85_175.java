package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_175 {
    private final Production85_175 production = new Production85_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}