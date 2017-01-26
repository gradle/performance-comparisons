package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_419 {
    private final Production85_419 production = new Production85_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}