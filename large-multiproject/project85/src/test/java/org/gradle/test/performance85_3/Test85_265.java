package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_265 {
    private final Production85_265 production = new Production85_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}