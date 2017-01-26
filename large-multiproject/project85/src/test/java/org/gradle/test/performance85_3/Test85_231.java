package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_231 {
    private final Production85_231 production = new Production85_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}