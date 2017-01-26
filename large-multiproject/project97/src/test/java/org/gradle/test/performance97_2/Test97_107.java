package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_107 {
    private final Production97_107 production = new Production97_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}