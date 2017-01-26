package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_207 {
    private final Production10_207 production = new Production10_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}