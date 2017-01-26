package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_267 {
    private final Production97_267 production = new Production97_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}