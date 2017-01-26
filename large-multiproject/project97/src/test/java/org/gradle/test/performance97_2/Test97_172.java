package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_172 {
    private final Production97_172 production = new Production97_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}