package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_76 {
    private final Production97_76 production = new Production97_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}