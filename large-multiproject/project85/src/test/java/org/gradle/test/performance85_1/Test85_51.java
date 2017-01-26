package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_51 {
    private final Production85_51 production = new Production85_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}