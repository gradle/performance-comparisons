package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_73 {
    private final Production94_73 production = new Production94_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}