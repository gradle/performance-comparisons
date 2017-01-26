package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_81 {
    private final Production85_81 production = new Production85_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}