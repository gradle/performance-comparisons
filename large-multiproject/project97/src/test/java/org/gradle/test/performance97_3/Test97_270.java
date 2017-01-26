package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_270 {
    private final Production97_270 production = new Production97_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}