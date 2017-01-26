package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_68 {
    private final Production97_68 production = new Production97_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}