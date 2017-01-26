package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_398 {
    private final Production85_398 production = new Production85_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}