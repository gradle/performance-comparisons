package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_479 {
    private final Production85_479 production = new Production85_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}