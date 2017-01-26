package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_83 {
    private final Production85_83 production = new Production85_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}