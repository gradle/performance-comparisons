package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_78 {
    private final Production97_78 production = new Production97_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}