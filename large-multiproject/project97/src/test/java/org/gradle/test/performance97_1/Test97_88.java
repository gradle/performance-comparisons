package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_88 {
    private final Production97_88 production = new Production97_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}