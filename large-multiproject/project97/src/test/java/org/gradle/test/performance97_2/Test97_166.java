package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_166 {
    private final Production97_166 production = new Production97_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}