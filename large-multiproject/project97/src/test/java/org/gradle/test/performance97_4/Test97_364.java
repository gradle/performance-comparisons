package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_364 {
    private final Production97_364 production = new Production97_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}