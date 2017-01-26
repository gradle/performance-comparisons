package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_154 {
    private final Production85_154 production = new Production85_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}