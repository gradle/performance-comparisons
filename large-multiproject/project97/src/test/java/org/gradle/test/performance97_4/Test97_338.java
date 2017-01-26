package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_338 {
    private final Production97_338 production = new Production97_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}