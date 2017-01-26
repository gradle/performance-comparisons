package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_388 {
    private final Production97_388 production = new Production97_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}