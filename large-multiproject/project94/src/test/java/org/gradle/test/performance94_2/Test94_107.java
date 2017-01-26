package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_107 {
    private final Production94_107 production = new Production94_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}