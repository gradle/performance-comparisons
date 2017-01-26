package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_207 {
    private final Production88_207 production = new Production88_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}