package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_215 {
    private final Production97_215 production = new Production97_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}