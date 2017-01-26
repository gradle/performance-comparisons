package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_29 {
    private final Production97_29 production = new Production97_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}