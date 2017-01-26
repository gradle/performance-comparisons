package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_3 {
    private final Production97_3 production = new Production97_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}