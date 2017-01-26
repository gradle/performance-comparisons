package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_286 {
    private final Production85_286 production = new Production85_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}