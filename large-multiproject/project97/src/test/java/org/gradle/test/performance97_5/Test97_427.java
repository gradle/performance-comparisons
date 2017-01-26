package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_427 {
    private final Production97_427 production = new Production97_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}