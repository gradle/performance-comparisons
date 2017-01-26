package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_88 {
    private final Production94_88 production = new Production94_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}