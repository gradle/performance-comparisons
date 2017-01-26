package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_31 {
    private final Production85_31 production = new Production85_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}