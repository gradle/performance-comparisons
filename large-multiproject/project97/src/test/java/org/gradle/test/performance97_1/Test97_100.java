package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_100 {
    private final Production97_100 production = new Production97_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}