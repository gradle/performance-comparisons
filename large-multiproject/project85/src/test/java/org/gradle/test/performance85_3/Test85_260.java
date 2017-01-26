package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_260 {
    private final Production85_260 production = new Production85_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}