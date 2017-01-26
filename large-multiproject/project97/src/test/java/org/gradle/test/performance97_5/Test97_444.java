package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_444 {
    private final Production97_444 production = new Production97_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}