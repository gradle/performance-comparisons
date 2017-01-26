package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_19 {
    private final Production85_19 production = new Production85_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}