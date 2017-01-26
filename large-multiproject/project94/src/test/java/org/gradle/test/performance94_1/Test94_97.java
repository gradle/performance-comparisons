package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_97 {
    private final Production94_97 production = new Production94_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}