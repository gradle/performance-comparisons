package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_150 {
    private final Production85_150 production = new Production85_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}