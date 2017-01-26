package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_55 {
    private final Production85_55 production = new Production85_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}