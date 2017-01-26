package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_213 {
    private final Production85_213 production = new Production85_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}