package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_73 {
    private final Production97_73 production = new Production97_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}