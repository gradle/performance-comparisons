package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_126 {
    private final Production94_126 production = new Production94_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}