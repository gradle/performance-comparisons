package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_305 {
    private final Production97_305 production = new Production97_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}