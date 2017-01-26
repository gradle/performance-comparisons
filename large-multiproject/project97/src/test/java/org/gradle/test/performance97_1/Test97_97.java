package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_97 {
    private final Production97_97 production = new Production97_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}