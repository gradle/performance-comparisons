package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_12 {
    private final Production85_12 production = new Production85_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}