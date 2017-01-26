package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_362 {
    private final Production97_362 production = new Production97_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}