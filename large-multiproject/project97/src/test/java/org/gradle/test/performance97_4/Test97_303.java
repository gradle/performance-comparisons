package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_303 {
    private final Production97_303 production = new Production97_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}