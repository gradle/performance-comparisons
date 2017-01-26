package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_25 {
    private final Production85_25 production = new Production85_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}