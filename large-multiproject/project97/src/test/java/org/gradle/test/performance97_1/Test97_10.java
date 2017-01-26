package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_10 {
    private final Production97_10 production = new Production97_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}