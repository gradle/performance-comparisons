package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_171 {
    private final Production85_171 production = new Production85_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}