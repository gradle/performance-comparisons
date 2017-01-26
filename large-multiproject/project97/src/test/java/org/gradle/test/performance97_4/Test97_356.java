package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_356 {
    private final Production97_356 production = new Production97_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}