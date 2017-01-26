package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_191 {
    private final Production85_191 production = new Production85_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}