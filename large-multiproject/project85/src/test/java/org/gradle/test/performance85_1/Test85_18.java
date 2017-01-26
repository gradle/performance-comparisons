package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_18 {
    private final Production85_18 production = new Production85_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}