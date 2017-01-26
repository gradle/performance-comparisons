package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_68 {
    private final Production94_68 production = new Production94_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}