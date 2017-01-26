package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_207 {
    private final Production7_207 production = new Production7_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}