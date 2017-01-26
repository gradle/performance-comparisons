package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_207 {
    private final Production18_207 production = new Production18_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}