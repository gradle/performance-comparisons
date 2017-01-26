package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_119 {
    private final Production97_119 production = new Production97_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}