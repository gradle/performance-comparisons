package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_36 {
    private final Production85_36 production = new Production85_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}