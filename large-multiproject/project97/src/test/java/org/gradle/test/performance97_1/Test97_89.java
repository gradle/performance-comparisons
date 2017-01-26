package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_89 {
    private final Production97_89 production = new Production97_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}