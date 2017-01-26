package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_207 {
    private final Production37_207 production = new Production37_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}