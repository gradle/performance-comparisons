package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_421 {
    private final Production85_421 production = new Production85_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}