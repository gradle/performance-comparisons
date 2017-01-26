package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_229 {
    private final Production97_229 production = new Production97_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}