package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_337 {
    private final Production85_337 production = new Production85_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}