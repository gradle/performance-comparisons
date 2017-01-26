package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_30 {
    private final Production85_30 production = new Production85_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}