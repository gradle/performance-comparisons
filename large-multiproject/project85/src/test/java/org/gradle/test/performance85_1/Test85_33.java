package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_33 {
    private final Production85_33 production = new Production85_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}