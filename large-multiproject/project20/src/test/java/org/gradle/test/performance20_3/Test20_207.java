package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_207 {
    private final Production20_207 production = new Production20_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}