package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_500 {
    private final Production97_500 production = new Production97_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}