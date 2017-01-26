package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_210 {
    private final Production85_210 production = new Production85_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}