package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_66 {
    private final Production97_66 production = new Production97_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}