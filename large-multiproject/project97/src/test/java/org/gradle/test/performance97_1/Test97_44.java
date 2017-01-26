package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_44 {
    private final Production97_44 production = new Production97_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}