package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_134 {
    private final Production97_134 production = new Production97_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}