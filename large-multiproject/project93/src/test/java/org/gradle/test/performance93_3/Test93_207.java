package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_207 {
    private final Production93_207 production = new Production93_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}