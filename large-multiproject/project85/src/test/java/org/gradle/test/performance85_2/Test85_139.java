package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_139 {
    private final Production85_139 production = new Production85_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}