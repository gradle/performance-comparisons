package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_253 {
    private final Production97_253 production = new Production97_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}