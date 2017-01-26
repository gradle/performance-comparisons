package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_465 {
    private final Production85_465 production = new Production85_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}