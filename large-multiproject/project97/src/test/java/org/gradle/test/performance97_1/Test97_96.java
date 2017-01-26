package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_96 {
    private final Production97_96 production = new Production97_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}