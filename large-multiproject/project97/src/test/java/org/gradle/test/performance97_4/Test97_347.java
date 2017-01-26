package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_347 {
    private final Production97_347 production = new Production97_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}