package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_27 {
    private final Production97_27 production = new Production97_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}