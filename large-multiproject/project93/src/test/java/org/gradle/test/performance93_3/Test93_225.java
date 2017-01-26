package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_225 {
    private final Production93_225 production = new Production93_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}