package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_207 {
    private final Production89_207 production = new Production89_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}