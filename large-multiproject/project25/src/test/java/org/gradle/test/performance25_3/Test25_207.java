package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_207 {
    private final Production25_207 production = new Production25_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}