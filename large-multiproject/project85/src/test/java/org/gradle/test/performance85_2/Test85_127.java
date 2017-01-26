package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_127 {
    private final Production85_127 production = new Production85_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}